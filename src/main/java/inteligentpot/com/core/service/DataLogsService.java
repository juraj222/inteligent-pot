package inteligentpot.com.core.service;

import java.util.List;

import inteligentpot.com.core.domain.DataLogs;

public interface DataLogsService {

	DataLogs createDataLogs(DataLogs dataLogs);

	List<DataLogs> getAllDataLogs();

}
