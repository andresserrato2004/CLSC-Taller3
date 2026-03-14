package edu.eci.labinfo.labtodo.unit.service;

import edu.eci.labinfo.labtodo.data.CommentRepository;
import edu.eci.labinfo.labtodo.service.CommentService;
import edu.eci.labinfo.labtodo.support.BaseUnitTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CommentServiceTest extends BaseUnitTest {

    @Mock
    private CommentRepository commentRepository;

    @InjectMocks
    private CommentService subject;

}
