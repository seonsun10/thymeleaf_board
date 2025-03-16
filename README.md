# 📌 타임리프 기반 게시판 프로젝트

## 1. 프로젝트 개요
**프로젝트 명:** 타임리프 기반 간단한 게시판  
**목표:**  
- Spring Boot + Thymeleaf + JPA + Oracle을 사용하여 CRUD 기능이 있는 게시판 개발  
- 사용자 친화적인 UI 설계  
- 기본적인 로그인 기능 포함  

---

## 2. 개발 프로세스

### 1️⃣ 기획안 (Project Proposal)
**📌 포함 내용:**  
- 프로젝트 개요  
- 주요 기능  
- 대상 사용자  
- 기대 효과  
- 기술 스택 (Spring Boot, Thymeleaf, JPA, Oracle 등)  
- 개발 일정  

---

### 2️⃣ 화면 설계서 (UI/UX Design)
> 페이지별 UI 설계 (와이어프레임 포함)  

**📌 주요 화면:**  
- **메인 페이지**: 게시판 목록, 로그인/회원가입 버튼  
- **게시판 목록 페이지**: 글 목록, 글쓰기 버튼, 페이지네이션  
- **게시글 상세 페이지**: 제목, 본문, 댓글 목록, 수정/삭제 버튼  
- **게시글 작성/수정 페이지**: 제목 입력, 본문 입력, 등록/수정 버튼  
- **회원가입 및 로그인 페이지**: 아이디, 비밀번호 입력, 버튼  


---

### 3️⃣ 기능 정의서 (Feature Specification)
> 기능별 세부 정의 및 동작 방식 정리  

| 기능명 | 설명 |
|------|------|
| 게시글 목록 조회 | 게시글을 리스트 형태로 출력 |
| 게시글 상세 조회 | 클릭 시 게시글 내용을 볼 수 있음 |
| 게시글 작성 | 제목, 본문을 입력하고 등록 |
| 게시글 수정 | 작성자가 자신의 글을 수정 가능 |
| 게시글 삭제 | 작성자가 자신의 글을 삭제 가능 |
| 댓글 작성 | 로그인한 사용자가 댓글 작성 가능 |
| 회원가입 | 사용자 계정을 생성 |
| 로그인/로그아웃 | 사용자 인증 및 세션 관리 |

---

### 4️⃣ 데이터베이스 설계서 (ERD)
> 데이터 모델 및 테이블 구조 정의  

#### **📌 주요 테이블**
1. **USER 테이블**
   - USER_ID (PK), USERNAME, PASSWORD, ROLE  
2. **BOARD 테이블**
   - BOARD_ID (PK), TITLE, CONTENT, AUTHOR, CREATED_DATE, VIEW_COUNT  
3. **COMMENT 테이블**
   - COMMENT_ID (PK), BOARD_ID (FK), CONTENT, AUTHOR, CREATED_DATE  


---

### 5️⃣ API 명세서 (API Documentation)
> API 엔드포인트 및 요청/응답 형식 정의  

| 기능 | URL | HTTP Method | 요청 데이터 | 응답 데이터 |
|------|----|------------|-----------|-----------|
| 게시글 목록 조회 | `/boards` | GET | - | JSON |
| 게시글 상세 조회 | `/boards/{id}` | GET | - | JSON |
| 게시글 작성 | `/boards` | POST | 제목, 내용 | 성공 메시지 |
| 게시글 수정 | `/boards/{id}` | PUT | 제목, 내용 | 성공 메시지 |
| 게시글 삭제 | `/boards/{id}` | DELETE | - | 성공 메시지 |

📌 **Swagger 문서화 추천**: `springdoc-openapi-starter-webmvc-ui` 활용 가능

---

### 6️⃣ 개발 일정 (Schedule)
> 프로젝트 진행 일정 (예상 3~4주)

| 주차 | 작업 내용 |
|------|---------|
| 1주차 | 기획안, 화면 설계, 데이터베이스 설계 |
| 2주차 | 기본 CRUD 기능 구현 (게시판) |
| 3주차 | 회원가입 및 로그인 기능 구현 |
| 4주차 | UI 개선, 테스트 및 배포 |

---

## 💡 기술 스택 (Tech Stack)
- **Backend**: Spring Boot, Spring Security, JPA  
- **Frontend**: Thymeleaf, HTML, CSS, JavaScript  
- **Database**: **Oracle 19c**  
- **Deployment**: AWS EC2, Docker  
- **Version Control**: GitHub  

---

## 🚀 실행 방법 (How to Run)
1. **프로젝트 클론**
   ```sh
   git clone https://github.com/your-repo/thymeleaf-board.git
   cd thymeleaf-board
