package edu.eci.labinfo.labtodo.unit.controller;

import edu.eci.labinfo.labtodo.controller.TaskController;
import edu.eci.labinfo.labtodo.service.CommentService;
import edu.eci.labinfo.labtodo.service.SemesterService;
import edu.eci.labinfo.labtodo.service.TaskService;
import edu.eci.labinfo.labtodo.service.UserService;
import edu.eci.labinfo.labtodo.support.BaseUnitTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class TaskControllerTest extends BaseUnitTest {

    @Mock
    private TaskService taskService;

    @Mock
    private UserService userService;

    @Mock
    private CommentService commentService;

    @Mock
    private SemesterService semesterService;

    @InjectMocks
    private TaskController subject;

}
