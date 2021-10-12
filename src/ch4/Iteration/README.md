# 반복문

## 2.1 for문

```java
for (int i=1; i <= 5; i++) {
  System.out.println("I can do it.")
}
```

1. i가 1부터 시작한다.
2. i가 5보다 작거나 같을 때 까지 반복한다.
3. 한번의 반복에 i를 1만큼 증가한다.

### 초기화

1. 변수를 두개 초기화 할 수도 있다.

```java
for (int i=1, j=10; i < 10; i++) {
  // do something
}
```

### 조건식

1. 생략할 수 있다. 하지만 생략되면 항상 참으로 간주하여 무한루프가 된다.

```java
for (int i=1; ; i++) {
	// infinity loop
}
```

### 증감식

1. 초기화와 마찬가지로 쉼표로 두개의 증감을 한번에 할 수 있다.

### 향상된 for문

1. for-each 구문이라고 생각하면 된다.
2. 각 배열의 원소를 순회한다.

```java
int[] arr = {1, 2, 3, 4, 5};

for(int num: arr) {
  System.out.println(num);
}
```

- `int num` 은 순회할 하나의 배열 원소를 나타내고, 원소와 같은 타입을 지정해야한다.
- `arr` 순회할 배열이다.

## 2.2 while 문

1. 조건식이 참인 동안 계속 실행된다

```java
while (조건식) {
  // do something.
}
```

- 조건식은 생략할 수 없다.

## 2.3 do-while문

1. 일단 do문으로 최초 1회 실행한다.
2. 이후 조건식이 참인 동안 반복 실행한다.

```java
do {
  // do something.
} while (조건식);
```

## 2.4 break

1. break 에서 가장 가까운 반복문을 빠져나간다.

## 2.5 continue

1. 반복문 내에서만 사용가능하다.
2. continue 을 만나면 곧바로 반복문 끝으로 이동하여 다음 반복문을 수행한다.

## 2.6 이름이 붙은 반복문

1. 반복문에 이름을 지정할 수 있다.
2. break, continue 구문에서 탈출 또는 계속 진행할 반복문을 이름으로 선정할 수 있다.

```java
package ch4.Iteration.Named;

public class Example1 {
	public static void main(String[] args) {
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5){
					break;					// j가 5가 될 때, 가장 가까운 for문이 종료된다. (j를 증가시키는 for문)
          break Loop1;		// 가장 상위 for문에 Loop1을 지정해주었기 때문에 j가 5가 될 때, for 문 전체가 종료된다.
					continue;				// j가 5가 될 때, 가장 가까운 for문을 다시 시작한다. -> j가 5인 구구단만 출력 x 
					continue Loop1;	// j가 5가 될 때, 이후 동작을 무시하고 Loop1을 다시 시작한다. -> j가 5 이후의 구구단은 출력 x
        }				
				System.out.printf("%d x %d = %d \n", i, j, i*j);
			}
		}
	}

}
```

1. `break` 
   1. 가장 가까운 for 문을 탈출한다.
   2. j가 5인 구구단만 출력하지 않는다.
2. `break Loop1`
   1. Loop1 이름을 가진 for 문을 탈출한다.
   2. 전체 for 문이 종료된다.
3. `continue`
   1. 가장 가까운 for 문의 현재 단계를 무시하고 다음 단계를 진행한다.
   2. j가 5인 구구단만 출력하지 않는다.
4. `continue Loop1`
   1. Loop1 이름을 가진 for 문의 현재 단계를 무시하고 다음 단계를 진행한다.
   2. j가 5 이상인 구구단을 출력하지 않고, i를 1증가한 상태로 구구단을 출력한다.