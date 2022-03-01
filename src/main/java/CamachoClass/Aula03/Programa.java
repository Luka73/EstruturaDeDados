package CamachoClass.Aula03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Programa {

    public static void main(String[] args) {

    }

    public static List<Objeto> getCausa(List<Objeto> items) {
        Objeto obj1;
        Objeto obj2;
        List<Objeto> groupedByCode1 = groupByCode1(items);
        List<Objeto> groupedByCode2 = groupByCode2(items);
        List<Objeto> resultList = new ArrayList<>();


       BigDecimal group1 = groupedByCode1.stream().map(Objeto::getValor2)
               .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal group2 = groupedByCode1.stream().map(Objeto::getValor1)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        obj1 = applyHierarchy(groupedByCode1);
        obj2 = applyHierarchy(groupedByCode2);

       if(BigDecimal.ZERO.compareTo(group1) == 0) {
           resultList.add(obj1);
       } else if (BigDecimal.ZERO.compareTo(group2) == 0) {
           resultList.add(obj2);
       } else {
           resultList.add(obj1);
           resultList.add(obj2);
       }

        return resultList;
    }

    public static Objeto applyHierarchy(List<Objeto> groupedByCode) {
        Optional<Objeto> maior = groupedByCode.stream().max((obj1, obj2) -> {
            int comparacao = obj1.getResulting().compareTo(obj2.getResulting());
            if (comparacao != 0) {
                return comparacao;
            }
            return Constantes.valueOf(obj2.getCode1()).compare(Constantes.valueOf(obj1.getCode1()));
        });

        return maior.orElse(null);
    }

    public static List<Objeto> groupByCode1(List<Objeto> input) {
        return input.stream().collect(Collectors.groupingBy(Objeto::getCode1))
                .entrySet().stream().map(i -> {
                    String key = i.getKey();
                    List<Objeto> value = i.getValue();
                    BigDecimal sumResulting = value.stream().map(Objeto::getResulting)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal sumV1 = value.stream().map(Objeto::getValor1)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal sumV2 = value.stream().map(Objeto::getValor2)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);

                    Objeto obj = new Objeto();
                    obj.setResulting(sumResulting);
                    obj.setValor1(sumV1);
                    obj.setValor2(sumV2);
                    obj.setCode1(key);
                    return obj;
                }).collect(Collectors.toList());
    }


    public static List<Objeto> groupByCode2(List<Objeto> input) {
        return input.stream().collect(Collectors.groupingBy(Objeto::getCode2))
                .entrySet().stream().map(i -> {
                    String key = i.getKey();
                    List<Objeto> value = i.getValue();
                    BigDecimal sumResulting = value.stream().map(Objeto::getResulting)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal sumV1 = value.stream().map(Objeto::getValor1)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal sumV2 = value.stream().map(Objeto::getValor2)
                            .reduce(BigDecimal.ZERO, BigDecimal::add);

                    Objeto obj = new Objeto();
                    obj.setResulting(sumResulting);
                    obj.setValor1(sumV1);
                    obj.setValor2(sumV2);
                    obj.setCode2(key);
                    return obj;
                }).collect(Collectors.toList());
    }
}
