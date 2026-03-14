package edu.eci.labinfo.labtodo.unit.service;

import edu.eci.labinfo.labtodo.data.TaskRepository;
import edu.eci.labinfo.labtodo.service.TaskService;
import edu.eci.labinfo.labtodo.support.BaseUnitTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class TaskServiceTest extends BaseUnitTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService subject;

}
