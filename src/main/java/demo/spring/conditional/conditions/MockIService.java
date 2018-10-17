package demo.spring.conditional.conditions;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MockIService implements IService {

    private final MockRepository repository;

    public void doSomithing(){
        System.out.println("I am Mock IService");
        repository.doSomithing();
    }

}
