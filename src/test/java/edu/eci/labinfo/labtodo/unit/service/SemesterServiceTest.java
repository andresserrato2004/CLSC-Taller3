package edu.eci.labinfo.labtodo.unit.service;

import edu.eci.labinfo.labtodo.data.SemesterRepository;
import edu.eci.labinfo.labtodo.service.SemesterService;
import edu.eci.labinfo.labtodo.support.BaseUnitTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class SemesterServiceTest extends BaseUnitTest {

    @Mock
    private SemesterRepository semesterRepository;

    @InjectMocks
    private SemesterService subject;

}
