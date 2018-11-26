# SOPT-23-Server

![SOPT_23_COLOR_LOGO](https://github.com/bghgu/SOPT-23-Server/blob/master/SOPT_23_COLOR_LOGO.png)

| 차수 | 내용                                  |
| ---- | ------------------------------------- |
| 1차  | JAVA 기초, Spring boot 시작하기       |
| 2차  | Spring Presentation Layer, Tomcat     |
| 3차  | Spring business Logic Layer, AWS EC2  |
| 4차  | MySQL, Mybatis, AWS RDS               |
| 5차  | File Upload, AWS S3, Interceptor, JWT |
| 6차  | URI, REST API 설계 및 구현            |
| 7차  | 클라이언트 연동 세미나                |
| 8차  | Spring Data JPA 맛보기, Q&A(보충)     |




# 1차 세미나 정리



**JAVA복습**

- 수 많은 기능을 객체라는 기본 단위로 나누고 , 이 객체들의 상호작용으로 프로그램을 구현

- 레고 블록처럼 객체를 조립해서 하나의 프로그램을 만드는 것!

  - 캡슐화 

    세부적인 구현을 외부로 들어나지 않게 내부 클래스로 만드는 것

  - 상속

    부모 클래스의 특성과 기능을 그대로 물려 받는 것

  - 다형성

    -Overloading는 다형성의 가장 대표적인 예

    **다형성 조건**

    1. 공통의 부모

    2. 공통이 메소드 재정의

    3. 부모 타입의 변수로 호출

**class**

-객체를 만드는 기능을 한다.

 field - 객체의 속성 상태 표현

​		접근 제어 지시자는 private로

**Method**

  - 동작, 행위, 기능

**constructor**(생성자)

- instance(값)을 생성해주는 특수한 메소드

  값 반환 x , 생성자의 이름은 클래스와 동일! 접근 제어 지시자는 무조건 public !!!

**Instance**

- 생성자가 종료되면 new 연산자는 객체의 참조 값을 반환 ./ 객체에 참조 값 할당 


**은닉화**

- 클래스의 Field는 Private 로 접근 제어 지시자로 지정한 뒤 !! Getter / Setter 값을 변경


**접근제어지시자**

|    지시자     | 클래스 내부 | 동일 패키지 | 상속 | 이외 |
| :-----------: | :---------: | :---------: | :--: | :--: |
|  **Private**  |      0      |      x      |  x   |  x   |
|  **Default**  |      0      |      0      |  x   |  x   |
| **Protected** |      0      |      0      |  0   |  x   |
|  **public**   |      0      |      0      |  0   |  0   |

***

**Builder Pattern**

1. 생성자에 들어갈 매개변수를 차례대로 받아드림, 그리고 모든 변수를 받은 후 한번에 사용
2. 데이터 순서는 상관없이 객체를 만든다.
3. 사용자가 봤을 때 명시적으로 명확하게 이해하게끔 (이름 등등)작성
4. 불필요한 생성자는 가급적 xx







# 2차 세미나 정리

## Server 배경 지식

**Client(서비스요청자) ->Server(시비스 자원의 제공자)**

- 작업을 분리해주는 분산 애플리케이션 구조/네트워크 아키텍처

   **android**- wifi - Spring Boot - Mysql

  (내가 구현해야 할 구조 server &client)


**HTTP(Hyper Text Transfer Protocol)**

1. www(월드와일드웹)에서 정보를 주고받을 수 있는 프로토콜
2. TCP, IP 프로토콜을 사용함 (80번 포트를 사용한다. )
3. 연결 상태를 유지하지 않는 프로토콜임

**HTTP Message**

1. 서버랑 클라이언트 간 데이터 교환방식
2. Request : 요청 메세지 (클라가 보내면 서버가 받아서 동작함)
3. Response : 응답 메세지 (서버가 대답함)
4. ASCII로 인코딩 된 텍스트 정보로 구성

시작줄 :HTTP method ,request Target(요청 대상, URL, 도메인), HTTP 버전 정보, ..

헤더 

본문 : 전송하고, 전송 받은 데이터

**HTTP Method**// 무조건 외우기

| Method | 설명 | CRUD   |
| ------ | ---- | ------ |
| GET    | 조회 | read   |
| POST   | 생성 | Create |
| PUT    | 수정 | update |
| DELETE | 삭제 | Delete |

**HTTP Status Code**

| Code | 설명                  | CRUD                                              |
| ---- | --------------------- | ------------------------------------------------- |
| 200  | OK                    | 서버가 요청                                       |
| 201  | Create                | 서버가 새 리소스를 작성했다.(생성)                |
| 204  | NO Content            | 서버가 요청은 처리했는데, 컨텐츠는 제공 못했을 때 |
| 400  | Bad Request           | 요청 이해 못했음                                  |
| 401  | Unauthorized          | 인증 필요                                         |
| 404  | Not Fount             | 리소스, 페이지 못찾겠음                           |
| 500  | Internal Server error | 서버 내부 오류                                    |
| 503  | Service Unavailable   | 일시적인 서비스 오류                              |





**MVC** model(db) - view(c) controller(제어자)

Model : 정보(데이터베이스)

View : 사용자 인터페이스, 프론트 엔드

Controller: 데이터와 비지니스 로직 사이의 상호 작용 관리 

​	사용자가 접근 한  URL에 따라서 맞는 데이터를 Model로 처리위임. 데이터를View에 반영후 사용자에게 알림



#### Spring MVC

**DispatcherServlet** - 클라이언트의 요청에 대한 최초 진입지점임

1.DS는 Spring Bean Definition 에 설정되어 있는 Handler Mapping 정보를 참조해서 이 요청을 처리할 Controller를 찾은 후 요청을 처리

2.Controller 는 Business Layer와 통신을 통하여 성공 유무에 따라서 ModelAndView 인스턴스를 반환

- UI layer에서 사용할 Model 데이터와 View에 대한 정보가 포함되어 있음

3.DisoatcherServlet는 ModelAndView의 이름에 따라 - ViewResolver를 참조해서 정보를 실질적으로 처리할 View를 생성

4.DispatcherServlet는 ViewResolver를 통해 전달된 View를 -ModelAndView에게 전달 

- 클라에게 UI를 제공할 책임은 View에게 있다는 거지!



#### Servlet

1. java를 사용해 웹페이지를 동적으로 생성하는 서버 pg

   |          JSP           |        Servlet         |
   | :--------------------: | :--------------------: |
   | html 에 java code 포함 | java code 에 html 포함 |

   - 외부 요청이 있을 때마다 Thread사용

#### Web Container(Servlet Container) - 서버 담는 빈 상자?

1. 웹 서버 컨포넌트 서블릿이랑 상호작용

2. Servlet,JSP,Server side Code 가 포함된 다인 타입의 파일들의 요청을 다룸

3. 서블릿 객체 생성,요청과 응답객체 생성, 관리


#### Was (Web Application Server) - 컴퓨터에 어플을 수행해주는 미들웨어(인터넷 상 HTTP를 이용해서)

1.동적 서버 컨텐츠 수행 , 주로 DB서버 

2.tomcat 같은거임

- 실행 구조
  1. Web server로 부터 요청 들어옴 -> 컨테이너가 처리
  2. 컨테이너는 web.xml(배포 서술자)를 참조 /서블릿에 대한 thread 생성 - httpservletRequest 및 httpservletResponse 객체를 생성하여 전달  -> 그 후 서블릿 호출
  3. 서블릿의 작업을 담당할 스레드는 /doPost(),doGet()을 호출 -> 생성된 동적 페이지를  response 객체에 실어서 컨테이너에게 !!
  4. 컨테이너는 Response ->HTTPResponse  형태로 전환해서  웹 서버에 전달, 생성되니 스레드 종료  만들었던 객체 소멸

#### Web Server(정적 컨텐츠 전송 서버)

1.웹 브라우저에서 요청하는 문서, 이미지 등등 전송함 Nginx
