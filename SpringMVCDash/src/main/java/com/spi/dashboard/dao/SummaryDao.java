package com.spi.dashboard.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spi.dashboard.model.SummaryModel;

public class SummaryDao {

	protected static final Logger LOGGER = LoggerFactory.getLogger(SummaryDao.class);

	private JdbcTemplate connProps;

	public JdbcTemplate getConnProps() {
		return connProps;
	}

	public void setConnProps(DataSource connProps) {
		this.connProps = new JdbcTemplate(connProps);
		LOGGER.info("#### Done with SummaryDao construction!");
	}

	private final String query = "SELECT X.FY, X.TRANSACTIONTYPE, COUNT(X.PRODUCTID) AS PRODUCTCOUNT FROM (SELECT YEAR(TH.TRANSACTIONDATE) AS FY, MONTH(TH.TRANSACTIONDATE) AS FM, TH.TRANSACTIONDATE, TH.PRODUCTID, P.NAME, TH.TRANSACTIONTYPE, TH.ACTUALCOST FROM [PRODUCTION].[TRANSACTIONHISTORY] TH JOIN [PRODUCTION].[PRODUCT] P ON (TH.PRODUCTID = P.PRODUCTID) WHERE 1=1) X WHERE 1=1 GROUP BY X.FY, X.TRANSACTIONTYPE;";

	public List<SummaryModel> getSummary() {
		List<SummaryModel> summaries = this.connProps.query(query, new RowMapper<SummaryModel>() {

			@Override
			public SummaryModel mapRow(ResultSet rs, int cnt) throws SQLException {
				SummaryModel sm = new SummaryModel();
				sm.setFinancialYear(rs.getInt("FY"));
				sm.setTransactionType(rs.getString("TRANSACTIONTYPE"));
				sm.setProductCount(rs.getInt("PRODUCTCOUNT"));
				return sm;
			}

		});
		return summaries;
	}

}
