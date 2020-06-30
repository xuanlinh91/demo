package com.example.demo.spec;

import com.example.demo.entity.Computer;
import com.example.demo.entity.People;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;

import static java.lang.String.join;

public class TestSpecs{
    private TestSpecs(){}

    public static Specification<People> testSpec2() {
        Specification<People> specification = Specification
                .where(hasName("linh"))
                .and(joinSpec());

        return specification;
    }

    public static Specification<People> testSpec1() {
        Specification<People> specification = Specification
                .where(hasName("linh"));

        return specification;
    }

    public static Specification<People> hasName(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("name"), name);
    }

    public static Specification<People> joinSpec() {
        return (root, query, criteriaBuilder) -> {
            Join<People, Computer> versionJoin = root
                    .join("peopleComputer");
//                    .join("peopleComputer1");
//            versionJoin.on(criteriaBuilder.isNotNull(versionJoin.get("computerCol2")));
            return criteriaBuilder.isNotNull(versionJoin.get("peopleComputer1"));
        };
    }
}
