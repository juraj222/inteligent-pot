package inteligentpot.com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import inteligentpot.com.core.domain.DataLogs;
import inteligentpot.com.core.repository.DataLogsRepository;

@Component
public class DataLogsServiceImpl implements DataLogsService {
	@Autowired
	DataLogsRepository dataLogsRepository;

	@Override
	public List<DataLogs> getAllDataLogs() {
		return (List<DataLogs>) dataLogsRepository.findAll();
	}

	@Override
	public DataLogs createDataLogs(DataLogs dataLogs) {
		return dataLogsRepository.save(dataLogs);
	}
}
