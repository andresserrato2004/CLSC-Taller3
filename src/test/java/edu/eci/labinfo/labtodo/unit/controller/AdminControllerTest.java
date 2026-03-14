package edu.eci.labinfo.labtodo.unit.controller;

import edu.eci.labinfo.labtodo.controller.AdminController;
import edu.eci.labinfo.labtodo.service.TaskService;
import edu.eci.labinfo.labtodo.service.UserService;
import edu.eci.labinfo.labtodo.support.BaseUnitTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class AdminControllerTest extends BaseUnitTest {

    @Mock
    private TaskService taskService;

    @Mock
    private UserService userService;

    @InjectMocks
    private AdminController subject;

    
}
