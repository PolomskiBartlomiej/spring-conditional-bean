package demo.spring.conditional.conditions;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrueServis implements IService {

    private final MockRepository repository;

    @Override
    public void doSomithing() {
        System.out.println("I am true IService");
        repository.doSomithing();
    }
}
