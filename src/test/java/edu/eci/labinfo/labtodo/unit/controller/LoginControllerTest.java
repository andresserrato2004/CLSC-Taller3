package edu.eci.labinfo.labtodo.unit.controller;

import edu.eci.labinfo.labtodo.controller.LoginController;
import edu.eci.labinfo.labtodo.service.UserService;
import edu.eci.labinfo.labtodo.support.BaseUnitTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class LoginControllerTest extends BaseUnitTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private LoginController subject;

}
