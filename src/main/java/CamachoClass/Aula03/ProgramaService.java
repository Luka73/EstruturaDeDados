package CamachoClass.Aula03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramaService {

    public List<Objeto> getCausa(List<Objeto> items) {
        List<Objeto> groupedByCode1 = groupByCode(items, Objeto::getCode1, Objeto::setCode1);
        List<Objeto> groupedByCode2 = groupByCode(items, Objeto::getCode2, Objeto::setCode2);
        List<Objeto> resultList = new ArrayList<>();

        BigDecimal group1 = groupedByCode1.stream().map(Objeto::getValor2)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal group2 = groupedByCode2.stream().map(Objeto::getValor1)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        Objeto obj1 = applyHierarchy(groupedByCode1);
        Objeto obj2 = applyHierarchy(groupedByCode2);

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

    public Objeto applyHierarchy(List<Objeto> groupedByCode) {
        Optional<Objeto> maior = groupedByCode.stream().max((obj1, obj2) -> {
            int comparacao = obj1.getResulting().compareTo(obj2.getResulting());
            if (comparacao != 0) {
                return comparacao;
            }
            return Constantes.valueOf(obj2.getCode1()).compare(Constantes.valueOf(obj1.getCode1()));
        });

        return maior.orElse(null);
    }

    public List<Objeto> groupByCode(List<Objeto> input, Function<Objeto,
            String> getCodeFunc, BiConsumer<Objeto, String> setCodeFunc) {
        return input.stream().collect(Collectors.groupingBy(getCodeFunc))
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
                    setCodeFunc.accept(obj, key);
                    return obj;
                }).collect(Collectors.toList());
    }
}
