package mock.quickstart;

import org.easymock.*;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Acceml on 2016/10/18.
 */
@RunWith(EasyMockRunner.class)
public class EasyMockTest extends EasyMockSupport {

    @TestSubject
    private ClassTested classUnderTest = new ClassTested();

    @Mock
    private Collaborator mock;

    @Test
    public void testRemoveNonExistingDocument() {
        EasyMock.expect(mock.documentAdded("hello")).andReturn("huming");
        replayAll();
        classUnderTest.setListener(mock);
        System.out.println(classUnderTest.sayHello("hello"));
        verifyAll();
    }

}
