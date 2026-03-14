package edu.eci.labinfo.labtodo.unit.controller;

import edu.eci.labinfo.labtodo.controller.SemesterController;
import edu.eci.labinfo.labtodo.service.SemesterService;
import edu.eci.labinfo.labtodo.support.BaseUnitTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class SemesterControllerTest extends BaseUnitTest {

    @Mock
    private SemesterService semesterService;

    @InjectMocks
    private SemesterController subject;

}
