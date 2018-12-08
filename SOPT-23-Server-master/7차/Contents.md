# Contents

## 모든 글 조회

| 메소드 | 경로                                    | 내용         |
| ------ | --------------------------------------- | ------------ |
| GET    | /contents?offset={offset}&limit={limit} | 모든 글 조회 |

QueryString 설명

| 파라미터 | 내용                            | 예시     | 값 범위     |
| -------- | ------------------------------- | -------- | ----------- |
| offset   | 시작 번호(기본값 = 0)           | offset=0 | 0 이상 정수 |
| limit    | 가져올 데이터 갯수(기본값 = 10) | limit=10 | 1 이상 정수 |

### 요청 헤더

```
Content-Type: application/json
```



### 응답 바디

모든 글 조회 성공

~~~
{
    "status": 200,
    "message": "모든 글 조회 성공",
    "data": [
        {
            "b_id": 11,
            "b_title": "글 제목2",
            "b_contents": "내용내용내용",
            "b_date": "2018-11-03T13:47:35.000+0000",
            "u_id": 2,
            "b_like": 0,
            "b_photo": null,
            "auth": false,
            "like": false
        },
        {
            "b_id": 20,
            "b_title": "10",
            "b_contents": "",
            "b_date": "2018-11-03T13:47:35.000+0000",
            "u_id": 2,
            "b_like": 0,
            "b_photo": null,
            "auth": false,
            "like": false
        }
    ]
}
~~~

***

***



## 게시글 조회

| 메소드 | 경로                   | 내용        |
| ------ | ---------------------- | ----------- |
| GET    | /contents/{contentIdx} | 게시글 조회 |

### 요청 헤더

~~~
Content-Type: application/json
Authorization: token(선택)
~~~



### 응답 바디

글 조회 성공

~~~
{
    "status": 200,
    "message": "글 조회 성공",
    "data": {
        "b_id": 11,
        "b_title": "1",
        "b_contents": "",
        "b_date": "2018-11-03T13:47:35.000+0000",
        "u_id": 2,
        "b_like": 0,
        "b_photo": null,
        "auth": false,
        "like": false
    }
}
~~~

글 조회 실패

~~~
{
    "status": 404,
    "message": "글이 존재하지 않습니다.",
    "data": null
}
~~~



***

***

## 글 작성 

| 메소드 | 경로      | 내용    |
| ------ | --------- | ------- |
| POST   | /contents | 글 작성 |

### 요청헤더

~~~
Authorization: token
~~~

### 요청바디

~~~
{
    "title" : "제목",
    "contents" : "내용",
    "photo" : 파일
}
~~~



### 응답 바디

글 작성 성공

~~~
{
    "status": 201,
    "message": "글 작성 성공",
    "data": null
}
~~~

글 작성 실패

~~~
{
    "status": 400,
    "message": "글 작성 실패",
    "data": null
}
~~~

인증 실패

~~~
{
    "status": 401,
    "message": "인증 실패",
    "data": null
}
~~~

DB 에러

~~~
{
    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
~~~

***

***

## 글 수정

| 메소드 | 경로                   | 내용    |
| ------ | ---------------------- | ------- |
| PUT    | /contents/{contentIdx} | 글 수정 |



### 요청 헤더

~~~
Application: token
~~~



### 요청 바디

~~~
{
    "title" : "제목",
    "contents" : "내용",
    "photo" : 파일
}
~~~



### 응답 바디

글 수정 성공

~~~
{
    "status": 200,
    "message": "글 수정 성공",
    "data": {
        "b_id": 22,
        "b_title": "123123123",
        "b_contents": "내용 테스트",
        "b_date": "2018-11-04T02:52:03.000+0000",
        "u_id": 2,
        "b_like": 1,
        "photo": null,
        "b_photo": "https://s3.ap-northeast-2.amazonaws.com/sopt-23-api-test/2b51f4250a4f48b4b49bcf2318b1bdb7.png",
        "auth": true,
        "like": true
    }

~~~

다른 회원 글 수정

~~~
{
    "status": 403,
    "message": "인가 실패",
    "data": false
}
~~~

 없는 글 수정

~~~
{
    "status": 404,
    "message": "글이 존재하지 않습니다.",
    "data": null
}
~~~

인증 실패

~~~
{
    "status": 401,
    "message": "인증 실패",
    "data": null
}
~~~

DB 에러

~~~

    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
~~~



***

***

### 글 삭제

| 메소드 | 경로                   | 내용    |
| ------ | ---------------------- | ------- |
| DELETE | /contents/{contentIdx} | 글 삭제 |

### 요청 헤더

~~~
Content-Type: application/json
Application: token
~~~

### 응답 바디

글 삭제 성공

~~~
{
    "status": 204,
    "message": "글 삭제 성공",
    "data": null
}
~~~

다른 회원 글 삭제 

~~~
{
    "status": 403,
    "message": "인가 실패",
    "data": false
}
~~~

없는 글 삭제 

```
{
    "status": 404,
    "message": "글이 존재하지 않습니다.",
    "data": null
}
```

인증 실패 

```
{
    "status": 401,
    "message": "인증 실패",
    "data": null
}
```

