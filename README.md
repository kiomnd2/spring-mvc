# Spring MVC
* 김영한씨의 스프링 MVC 정리 <br/>
* 스프링부트 핵심원리에 대해 이해함.

## 1. 서블릿


### @ServletComponentScan
 - servlet을 찾아서 자동으로 등록합니다 

### 서블릿 클래스
 - HttpServlet 상속받아 구현합니다.
 - @WebServlet 애노테이션 등록합니다
 - service 메서드 구현 : 서블릿 호출시 가장 먼저 호출됩니다
 
### logging.level.org.apache.coyote.http11=debug
 - http request, response 정보를 볼 수 있습니다.
 
 
### HttpServletRequest
 - 서블릿은 개발자 대신 요청메세지를 파싱해주고 사용할 있게 해줌
 - http 스펙이 제공하는 요청메세지 자체를 이해해야한다.
 - 데이터 전달
    - GET : 쿼리 파라미터
        - 메세지 바디 없이 쿼리 파라미터 전달
    - POST : Html Form
        - 메세지 바디에 쿼리 파라미터 형식으로 전달
        - application/x-www-form-urlencoded
    - Http Message Body
        - HTTP API 에 주로 사용, JSON, XML, TEXT
        - POST,PUT,PATCH
     
 
### HttpServletResponse
 - Http 응답 메세지 생성
    - 헤더 생성
    - 바디 생성



