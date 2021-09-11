package ch07.part05.generics.wildcard;

import ch07.part05.generics.basic.TypeA;

/** 제네릭 타입을 타입 파라미터로 사용하는 경우 와일드카드 타입이 사용된다. */
/** 여기서 TypeA는 사용하는 시점이기 때문에 타입 파라미터 부분에 특정 타입이 들어가야 한다. */
/** 어떤 클래스 타입이라도 허용하겠다는 의미로 와일드 카드를 사용한 에이다. */
public class TypeD <T extends TypeA<?>> {
}
