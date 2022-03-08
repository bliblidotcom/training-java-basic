package three.todolist;

import com.gdn.bootcamp.day1assignment.three.todolist.Todo;
import com.gdn.bootcamp.day1assignment.three.todolist.TodoRepository;
import com.gdn.bootcamp.day1assignment.three.todolist.TodoService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class TodoServiceTest {
    private static TodoRepository todoRepository;
    private static List<Todo> todoDatabase;

    private static TodoService todoService;

    @BeforeAll
    public static void setup() {
        Todo todoDummy1 = new Todo(UUID.randomUUID(), "todo1", "description", "done", Timestamp.valueOf(LocalDateTime.now()), Timestamp.valueOf(LocalDateTime.now()));

        todoDatabase = new ArrayList<>();
        todoDatabase.add(todoDummy1);

        todoRepository = Mockito.mock(TodoRepository.class, withSettings().useConstructor(todoDatabase));
        todoService = new TodoService(todoRepository);
    }

    @Test
    @Order(1)
    public void testSuccessReadAll() {
        List<Todo> expected = todoDatabase;
        when(todoRepository.readAll()).thenReturn(expected);
        assertEquals(expected, todoService.readAll());
    }

    @Test
    public void testFailReadAllWhenEmpty() {
        when(todoRepository.readAll()).thenThrow(new RuntimeException("Todo list is empty"));
        assertThrows(RuntimeException.class, () -> todoService.readAll());
    }

    @Test
    public void testSuccessReadById() {
        Todo expected = todoDatabase.get(0);
        when(todoRepository.readById(expected.getId())).thenReturn(expected);
        assertEquals(expected, todoService.readById(expected.getId()));
    }

    @Test
    public void testFailReadByIdWhenNotFound() {
        UUID unFoundTodoId = UUID.randomUUID();
        when(todoRepository.readById(unFoundTodoId)).thenThrow(new RuntimeException("Todo not found"));
        assertThrows(RuntimeException.class, () -> todoService.readById(unFoundTodoId));
    }

    @Test
    public void testSuccessCreate() {
        Todo expected = todoDatabase.get(0);
        when(todoRepository.create(any(Todo.class))).thenReturn(expected);
        assertEquals(expected, todoService.create(expected));
    }

    @Test
    public void testFailCreateWhenNull() {
        assertThrows(RuntimeException.class, () -> todoService.create(null));
    }

    @Test
    public void testFailCreateWhenIdNotUnique() {
        Todo expected = todoDatabase.get(0);
        when(todoRepository.create(expected)).thenThrow(new RuntimeException("Todo id must be unique"));
        assertThrows(RuntimeException.class, () -> todoService.create(expected));
    }

    @Test
    public void testSuccessUpdateById() {
        Todo expected = todoDatabase.get(0);
        when(todoRepository.updateById(expected.getId(), expected)).thenReturn(expected);
        assertEquals(expected, todoService.updateById(expected.getId(), expected));
    }

    @Test
    public void testFailUpdateByIdWhenNotFound() {
        Todo expected = todoDatabase.get(0);
        UUID unFoundTodoId = UUID.randomUUID();
        when(todoRepository.updateById(unFoundTodoId, expected)).thenThrow(new RuntimeException("Todo not found"));
        assertThrows(RuntimeException.class, () -> todoService.updateById(unFoundTodoId, expected));
    }

    @Test
    public void testSuccessDeleteById() {
        Todo expected = todoDatabase.get(0);
        when(todoRepository.deleteById(expected.getId())).thenReturn(expected);
        assertEquals(expected, todoService.deleteById(expected.getId()));
    }

    @Test
    public void testFailDeleteByIdWhenNotFound() {
        UUID unFoundTodoId = UUID.randomUUID();
        when(todoRepository.deleteById(unFoundTodoId)).thenThrow(new RuntimeException("Todo not found"));
        assertThrows(RuntimeException.class, () -> todoService.deleteById(unFoundTodoId));
    }
}
