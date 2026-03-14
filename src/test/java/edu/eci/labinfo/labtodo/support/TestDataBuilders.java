package edu.eci.labinfo.labtodo.support;

import edu.eci.labinfo.labtodo.model.AccountType;
import edu.eci.labinfo.labtodo.model.Comment;
import edu.eci.labinfo.labtodo.model.Role;
import edu.eci.labinfo.labtodo.model.Semester;
import edu.eci.labinfo.labtodo.model.Status;
import edu.eci.labinfo.labtodo.model.Task;
import edu.eci.labinfo.labtodo.model.TopicTask;
import edu.eci.labinfo.labtodo.model.TypeTask;
import edu.eci.labinfo.labtodo.model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Static factory methods for building domain objects inside tests.
 *
 * Why this class exists:
 *   AAA — keeps the Arrange section concise and intention-revealing.
 *   Independent — every method returns a new, fully-initialised object.
 *                 Tests never share a mutable instance produced here.
 */
public final class TestDataBuilders {

    private TestDataBuilders() {
        // Utility class — no instantiation.
    }
}
