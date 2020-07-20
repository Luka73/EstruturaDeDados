package JUnitMockito;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator c;

    @Rule //pra usar a annotation @Mock ao invés do trecho comentado
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    CalculatorService cs;
    //CalculatorService cs = mock(CalculatorService.class);

    @Before
    public void setUp() {
        c = new Calculator(cs);
    }

    @Test
    public void testAdd() {
        when(cs.add(2,3)).thenReturn(5);
        assertEquals(10, c.perform(2,3));
        verify(cs).add(2,3); //garante q o serviço está sendo chamado
    }

    @After
    public void showMsg() {
        System.out.println("Método testado!");
    }

}
