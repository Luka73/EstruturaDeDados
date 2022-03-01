package CamachoClass.Aula03;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static CamachoClass.Aula03.Constantes.*;
import static CamachoClass.Aula03.Programa.groupByCode1;
import static org.junit.Assert.assertEquals;

public class ProgramaTest {

    @Test
    public void teste1() {
        List<Objeto> lista = getLista1();

        List<Objeto> actual = Programa.getCausa(lista);
        assertEquals(1, actual.size());
        assertEquals(MKTVL.name(), actual.get(0).getCode1());
    }

    @Test
    public void teste2() {
        List<Objeto> lista = getLista2();

        List<Objeto> listaAgrupada = groupByCode1(lista);
        Objeto objINFLA = listaAgrupada.stream().filter(i -> i.getCode1().equals(INFLA.name())).findFirst().get();
        Objeto objMKTVL= listaAgrupada.stream().filter(i -> i.getCode1().equals(MKTVL.name())).findFirst().get();
        Objeto objPRVVL = listaAgrupada.stream().filter(i -> i.getCode1().equals(PRVVL.name())).findFirst().get();

        assertEquals(objINFLA.getResulting(), BigDecimal.valueOf(101489.51));
        assertEquals(objMKTVL.getResulting(), BigDecimal.valueOf(44019.58));
        assertEquals(objPRVVL.getResulting(), BigDecimal.valueOf(2151.12));

        List<Objeto> actual = Programa.getCausa(lista);
        assertEquals(1, actual.size());
        assertEquals(INFLA.name(), actual.get(0).getCode1());
    }

    @Test
    public void teste3() {
        List<Objeto> lista = getLista3();

        List<Objeto> actual = Programa.getCausa(lista);
        assertEquals(1, actual.size());
        assertEquals(PRVVL.name(), actual.get(0).getCode2());
    }

    @Test
    public void teste4() {
        List<Objeto> lista = getLista4();

        List<Objeto> actual = Programa.getCausa(lista);
        assertEquals(2, actual.size());
        assertEquals(MKTVL.name(), actual.get(0).getCode1());
        assertEquals(PRVVL.name(), actual.get(1).getCode2());
    }

    @Test
    public void teste5() {
       List<Objeto> lista = getLista5();

        List<Objeto> listaAgrupada = groupByCode1(lista);
        Objeto objINFLA = listaAgrupada.stream().filter(i -> i.getCode1().equals(INFLA.name())).findFirst().get();
        Objeto objMKTVL= listaAgrupada.stream().filter(i -> i.getCode1().equals(MKTVL.name())).findFirst().get();
        Objeto objPRVVL = listaAgrupada.stream().filter(i -> i.getCode1().equals(PRVVL.name())).findFirst().get();

        assertEquals(objINFLA.getResulting(), BigDecimal.valueOf(8065.54));
        assertEquals(objMKTVL.getResulting(), BigDecimal.valueOf(2506.11));
        assertEquals(objPRVVL.getResulting(), BigDecimal.valueOf(2578.22));

        List<Objeto> actual = Programa.getCausa(lista);
        assertEquals(2, actual.size());
        assertEquals(INFLA.name(), actual.get(0).getCode1());
        assertEquals(PRVVL.name(), actual.get(1).getCode2());
    }

    @Test
    public void getHierarchyTest() {
        List<Objeto> lista = groupByCode1(getLista5());

        Objeto actual = Programa.applyHierarchy(lista);
        assertEquals(BigDecimal.valueOf(8065.54), actual.getResulting());
        assertEquals(INFLA.name(), actual.getCode1());
    }

    @Test
    public void groupByCode1Test() {
        List<Objeto> lista = getLista1();

        List<Objeto> actual = groupByCode1(lista);

        assertEquals(3, actual.size());

    }


    private List<Objeto> getLista1() { // Só v1 preenchido && code1 tudo igual (Exemplo: MKTVL) -> output: code1 (MKTVL)
        Objeto obj1 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(512252.41), BigDecimal.valueOf(12512.11), BigDecimal.ZERO);
        Objeto obj2 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(2151.12), BigDecimal.valueOf(1239.55), BigDecimal.ZERO);
        Objeto obj3 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(32898.36), BigDecimal.valueOf(985.22), BigDecimal.ZERO);
        Objeto obj4 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(72154.78), BigDecimal.valueOf(111.11), BigDecimal.ZERO);
        Objeto obj5 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(512252.41), BigDecimal.valueOf(98745.95), BigDecimal.ZERO);
        return List.of(obj1, obj2, obj3, obj4, obj5);
    }

    private List<Objeto> getLista2() { // Só v1 preenchido && code 1 diferente (Exemplo: INFLA, MKTVL)
        // -> Pegar o maior do somatório do resulting. Se empate, usar hirarquia. -> output: code1 (?)
        Objeto obj1 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(11121.22), BigDecimal.valueOf(12512.11), BigDecimal.ZERO);
        Objeto obj2 = new Objeto(PRVVL.name(), PRVVL.name(), BigDecimal.valueOf(2151.12), BigDecimal.valueOf(1239.55), BigDecimal.ZERO);
        Objeto obj3 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(32898.36), BigDecimal.valueOf(985.22), BigDecimal.ZERO);
        Objeto obj4 = new Objeto(INFLA.name(), PRVVL.name(), BigDecimal.valueOf(72154.78), BigDecimal.valueOf(111.11), BigDecimal.ZERO);
        Objeto obj5 = new Objeto(INFLA.name(), PRVVL.name(), BigDecimal.valueOf(29334.73), BigDecimal.valueOf(98745.95), BigDecimal.ZERO);
        return List.of(obj1, obj2, obj3, obj4, obj5);
    }

    private List<Objeto> getLista3() {
        Objeto obj1 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(11121.22), BigDecimal.ZERO, BigDecimal.valueOf(12512.11));
        Objeto obj2 = new Objeto(PRVVL.name(), PRVVL.name(), BigDecimal.valueOf(2151.12), BigDecimal.ZERO, BigDecimal.valueOf(1239.55));
        Objeto obj3 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(32898.36), BigDecimal.ZERO, BigDecimal.valueOf(985.22));
        Objeto obj4 = new Objeto(INFLA.name(), PRVVL.name(), BigDecimal.valueOf(72154.78), BigDecimal.ZERO, BigDecimal.valueOf(111.11));
        Objeto obj5 = new Objeto(INFLA.name(), PRVVL.name(), BigDecimal.valueOf(29334.73), BigDecimal.ZERO, BigDecimal.valueOf(98745.95));
        return List.of(obj1, obj2, obj3, obj4, obj5);
    }

    private List<Objeto> getLista4() {
        Objeto obj1 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(1251.22), BigDecimal.valueOf(11121.22), BigDecimal.valueOf(12512.11));
        Objeto obj2 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(2578.22), BigDecimal.valueOf(2151.12), BigDecimal.valueOf(1239.55));
        Objeto obj3 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(125489), BigDecimal.valueOf(32898.36), BigDecimal.valueOf(985.22));
        Objeto obj4 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(1222.66), BigDecimal.valueOf(72154.78), BigDecimal.valueOf(111.11));
        Objeto obj5 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(121.11), BigDecimal.valueOf(29334.73), BigDecimal.valueOf(98745.95));
        return List.of(obj1, obj2, obj3, obj4, obj5);
    }

    private List<Objeto> getLista5() {
        Objeto obj1 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(1251.22), BigDecimal.valueOf(11121.22), BigDecimal.valueOf(12512.11));
        Objeto obj2 = new Objeto(PRVVL.name(), PRVVL.name(), BigDecimal.valueOf(2578.22), BigDecimal.valueOf(2151.12), BigDecimal.valueOf(1239.55));
        Objeto obj3 = new Objeto(MKTVL.name(), PRVVL.name(), BigDecimal.valueOf(1254.89), BigDecimal.valueOf(32898.36), BigDecimal.valueOf(985.22));
        Objeto obj4 = new Objeto(INFLA.name(), PRVVL.name(), BigDecimal.valueOf(1222.66), BigDecimal.valueOf(72154.78), BigDecimal.valueOf(111.11));
        Objeto obj5 = new Objeto(INFLA.name(), PRVVL.name(), BigDecimal.valueOf(6842.88), BigDecimal.valueOf(29334.73), BigDecimal.valueOf(98745.95));
        return List.of(obj1, obj2, obj3, obj4, obj5);
    }
}
