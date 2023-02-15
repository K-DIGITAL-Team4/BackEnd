# 사업용 차량 :truck:  안전 위험 분석 웹서비스 프로젝트 

사업용 차량의 운행기록을 바탕으로 차량 안전 관리정보를 보여주는 웹서비스입니다.
#### Project execution period : 2023.01.11~02.09
#### Project Hosting : 호스팅 주소 입력할 것
------------------

## Description
차량의 운전자 및 관리자를 위한 정보제공 시스템으로, 차량에 부착된 단말기로 운행정보를 읽어들여 차량 관리 및 안전 등급 등을 분석해서 알려준다.

## Back-End Team:family:
+ [박경관](https://github.com/kyunggwan)
+ [김찬준](https://github.com/ckswns879)

## :pushpin:Requirements
- SpringBoot 4.16.1.RELEASE
- eclipse 4.25.0
- apache tomcat 9.0.67
- Java JDK 17 or higher
- Maven 3.0.1
- use MySQL database > JdbcTemplate
<div alien=center>
<img src="https://img.shields.io/badge/Spring boot-6DB33F?style=for-the-badge&logo=appveyor&logoColor=white" />
<img src="https://img.shields.io/badge/eclipse-2C2255?style=for-the-badge&logo=appveyor&logoColor=white" />
<img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=appveyor&logoColor=white" />
<img src="https://img.shields.io/badge/amazon AWS-232F3E?style=for-the-badge&logo=appveyor&logoColor=white" />
<img src="https://img.shields.io/badge/Mysql-4479A1?style=for-the-badge&logo=appveyor&logoColor=white" />
</div>

## :fire:Final Version
![Final](https://user-images.githubusercontent.com/113881846/218413465-dc4bcdef-280d-4ad8-8837-91783dee9694.png)

## :bookmark: Explanation
- DB는 AWS의 RDS 인스턴스를 설정해서 구성했다.
- Springboot는 위의 코드로 AWS의 EC2 서버에서 배포했다.

## :white_check_mark:What's missing
- JPA로 구현하려 했으나 기능이 너무 적어 비효율적이라고 생각했다. 다른 프로젝트에서는 JPA로 해볼 예정이다.
- 회원가입, 로그인 기능을 최종결과물에서 구현하지 못했다.
- EC2에 배포하긴 했지만 Docker에 대한 이해가 부족하다.
