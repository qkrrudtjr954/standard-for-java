# 2. 변수의 타입 

변수가 저장하는 값은 여러가지 타입에 따라 저장될 공간의 크기와 형식이 다르다.
그래서, 변수를 선언할 때 적절한 타입을 지정하여 선언해야한다. 

### 기본형과 참조형

- 기본형
  - 실제 값(data)를 저장한다.
  - boolean, char, byte, short, int, long, float, double 타입이 기본형에 해당한다.
- 참조형
  - 특정 값이 저장되어 있는 메모리 주소(address)를 저장한다.
  - 기본형을 제외한 모든 타입은 참조형에 해당한다.
  - 클래스를 선언하는 것은 하나의 새로운 참조형 타입을 생성하는 것과 같다.

## 2.1 기본형 

### 종류

논리형

- boolean
- true, false 중 하나의 값을 갖는다.

문자형

- char
- 문자를 저장하는데, 사용되며, 변수에 하나의 문자만 저장할 수 있다.

정수형

- byte, short, **int**, long
- 정수를 저장하는데 사용되고, 주로 int가 사용된다.
- byte 는 이진데이터를 다룰 때 사용된다.
- short는 C언어와의 호환을 위해서 추가되었다.

실수형

- float, **double**
- 실수를 저장하는데 사용되며, 주로 double이 사용된다.

### 데이터의 크기

<table>
  <tr>
    <th>종류 / 크기</th>
    <th>1byte</th>
    <th>2byte</th>
    <th>4byte</th>
    <th>8byte</th>
  </tr>
  <tr>
    <th>논리형</th>
    <td>boolean</td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>문자형</th>
    <td></td>
    <td>char</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>정수형</th>
    <td>byte</td>
    <td>short</td>
    <td><b>int</b></td>
    <td>long</td>
  </tr>
  <tr>
    <th>실수형</th>
    <td></td>
    <td></td>
    <td>float</td>
    <td><b>double</b></td>
  </tr>
</table>

## 2.2 상수와 리터럴

```java
int age = 10;								// age는 변수, 10은 리터럴
final int MAX_VALUE = 100;	// MAX_VALUE는 상수, 100은 리터럴
```

### 상수

- 변수와 달리 한번 값을 저장하면 다른 값으로 변경할 수 없는 값
- `final` 키워드를 사용해서 정의한다.

### 리터럴

- 일반적으로 우리가 상수라고 알고있는 값
- 값 자체로 의미하는 것

### 리터럴의 타입

리터럴 값도 타입을 가지며, 타입을 표시하기 위해 접미사를 붙인다.

<table>
  <tr>
  	<th>접미사</th>
    <th>설명</th>
    <th>예제</th>
  </tr>
  <tr>
  	<th>l, L</th>
    <td>long 값을 나타낸다. l은 1과 헷갈리기 때문에 L을 주로 사용한다.</td>
    <td>
      <code>long l= 1000L</code>
    </td>
  </tr>
  <tr>
  	<th>f, F</th>
    <td>float 값을 나타낸다.</td>
    <td>
      <code>float f = 10.0f</code><br>
      <code>float f = 10f</code>
    </td>
  </tr>
	<tr>
  	<th>d, D</th>
    <td>double 값을 나타낸다. double은 기본값이기 때문에 접미사를 붙이지 않아도 된다.</td>
    <td>
      <code>double d = 10D</code>
    </td>
  </tr>
</table>





