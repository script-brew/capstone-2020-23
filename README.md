<img src="https://user-images.githubusercontent.com/29545214/77552135-7f998880-6ef6-11ea-8796-d9bd3bdc992b.png" width="720" height="405">

# [**MOAYO**](https://kookmin-sw.github.io/capstone-2020-23/)

[![slack](https://img.shields.io/badge/chat%20on-Slack-53185A)](https://capstone23workspace.slack.com/)
[![notion](https://img.shields.io/badge/spec-Notion-35363A)](https://www.notion.so/capstone23workspace)

<br><br>

# 1. 프로젝트 소개

  <br>

* ## 개요
  
  관심 있는 걸 모아서 보고, 내 관심사를 모아서 표출하는 것은 우리에게 아주 익숙하고 중요한 일이다.

  매일매일 SNS에 접속해서 마음에 드는 게시물에 좋아요를 누르고, 재미있어 보이는 게시물을 보는 것은 우리에게 아주 익숙하다.

  이런 SNS 중 요새 가장 대세인 걸 꼽으라면, 단연 **인스타그램**이다.

  그런데 인스타그램은 게시물을 올리기에는 적합하지만, 내가 관심 있는 것을 모아서 보거나 저장하기에는 적절하지 않다.

  검색 탭에서 무언가를 검색하면 관련 없는 피드가 너무 많고, 게시물을 저장해도 분류를 할 수 없고 공유도 할 수 없기 떄문에 저장 기능은 잘 쓰이지 않는다.

  무엇보다 여러 검색어를 동시에 넣어 검색할 수 없다는 것은 큰 아쉬움으로 남는다.
  <br><br>
  그래서 우리는 카테고리를 분류해서 검색하고, 검색한 결과를 모아 도감의 형태로 보여주고 공유할 수 있는 서비스 '모아요'를 만들기로 했다.
  <br><br>
  '모아요' ('MoaYo') 는 사용자가 관심 있는 카테고리에 대해 게시글들을 모아서 불러온다는 의미와 나의 ('My') 라는 의미를 담고 있다.

<br>

* ## 구성

  <br>

  * ### 도감 생성
  
    <img src="https://user-images.githubusercontent.com/42925501/77553810-a062dd80-6ef8-11ea-9dc4-56253b96bd11.png" width="640" height="360">
    <br><br>

    - 도감 생성 메뉴를 통해 유저의 커스텀 도감을 **카테고리 별로** 만들 수 있다.
    - 카테고리 입력란에 원하는 키워드를 입력 시, 관련된 **추천 키워드**가 표시된다.
    - 1차로 생성된 카테고리에 2, 3차의 하위 계층 카테고리를 생성할 수 있으며, 1차를 제외한 계
층에서는 같은 레벨의 카테고리를 추가 할 수 있다.
    - 모든 작업이 완료되었을 때, 도감생성 버튼을 통해 도감이 저장된다.
생성된 도감은 도감 관리 메뉴에서 확인이 가능하다.

  <br>

  * ### 도감 관리
  
    * ### 도감 관리 메뉴

      <img src="https://user-images.githubusercontent.com/42925501/77553921-c4262380-6ef8-11ea-99e6-ca082c95d898.png" width="640" height="360">
      <br><br>

      - 도감관리 메뉴 접근 시, 유저가 생성한 도감 리스트와 스크랩 한 컬렉션들을 확인할 수
있다.
      - 도감 리스트에 표시되는 각 도감의 명칭은 사용자가 지정한 1차 키워드이다.
      
      - 한개의 도감을 선택하면 **카테고리 계층구조**가 시각적으로 표시되고, 각 요소
를 클릭하면 **게시물 리스트**가 표시된다.
      
      - 선택된 각 도감의 상세 페이지에서 도감 **수정**과 **삭제**가 가능하다.

    <br>
    
    * ### 게시물 리스트
      
      <img src="https://user-images.githubusercontent.com/42925501/77553868-b375ad80-6ef8-11ea-8017-c42cdaf3480d.png" width="640" height="360">
      <br><br>

      - 게시물들은 **카드 형식**으로 나열된다.

      - 상단 뷰에는 사용자가 **스크랩한 게시물**들이 최근 저장한 순서로 보여진다.
      
      - 하단 뷰에는 **키워드로 검색된** 인스타그램 게시물들이 보여진다.
      
      - 좌측 네비게이션 메뉴를 통해 선택한 도감이 **트리 뷰**로 표시되며, 다른 키워
드를 클릭 시 해당 키워드로 재검색된 게시물 리스트가 보여진다.

      - 게시물을 *스크랩*하면 썸네일 이미지와 게시글 내용이 도감에 저장된다.
      
      - 각각의 게시물들을 클릭 시, 인스타그램의 게시물 **원본 페이지로** 연결된다.
    
  <br>

  * ### 도감 공유

    <img src="https://user-images.githubusercontent.com/42925501/77553943-c9836e00-6ef8-11ea-805a-de8b5bda1575.png" width="640" height="360">
    <br><br>

    - 도감관리 메뉴의 공유하기 탭을 통해 유저의 도감을 공유할 수 있으며, 공유된 도감 리스트를
관리 할 수 있다.

    - 타 유저들이 공유한 도감 리스트를 확인 할 수 있으며, 도감 리스트는 최신순/인기순으로
정렬된다.

    - 다른유저들의 도감에 좋아요가 가능하며, 좋아요 수는 인기순 정렬에 반영된다.


<br><br>


# 2. *Abstract*

  It is very familiar and important to us to gather and see what interests you, and to gather and express my interests.

  It is very familiar to us to connect to SNS every day, like the posts you like, and see the posts that look interesting.

  If you choose the most popular one among these SNS, it is definitely **Instagram**.

  However, Instagram is suitable for posting posts, but not for collecting and viewing or saving what I am interested in.

  If you search for something on the Search tab, there are too many irrelevant feeds, and even if you save a post, you won't be able to categorize it, and you won't be able to share it.

  Most of all, it is a pity that you cannot search by putting multiple search terms at the same time.
  <br><br>
  So, we decided to create a service called 'MoaYo', which categorizes and searches categories, and collects and displays the search results in the form of illustrated books.
  <br><br>
  'MoaYo' contains the meaning of collecting and loading posts for the categories that the user is interested in, and of 'MY'.


<br><br>


# 3. 소개 영상

- **TODO**


<br><br>


# 4. 팀 소개

<br>

### 김혁만 교수님

<img src="https://i.ya-webdesign.com/images/light-bulb-icon-png-2.png" width="300" height="300">

(교수님의 요청으로 아이콘으로 대체합니다.)
<br><br>
:heavy_check_mark: 팀 지도, 아이디어 컨펌 및 조언, 구현 방향 조언

<br><br>

### 맹산하

<img src="https://user-images.githubusercontent.com/29545214/77186349-14c30880-6b16-11ea-8e8d-629b71268499.jpeg" width="300" height="300">
<br><br>

:heavy_check_mark: 팀장, 인스타그램 크롤링 api 서버 구축 및 데이터 코어 로직 개발
<br><br>
:heavy_check_mark: [GitHub](https://github.com/joshua-dev)
<br><br>
:heavy_check_mark: msh01175@gmail.com

<br><br>

### 강길웅

<img src="https://user-images.githubusercontent.com/29545214/77186529-5eabee80-6b16-11ea-8482-6ab68f04daa5.jpeg" width="300" height="300">
<br><br>

:heavy_check_mark: 공유 api 서버 구축 및 앱 데이터 로직 개발
<br><br>
:heavy_check_mark: [GitHub](https://github.com/wooooong9)
<br><br>
:heavy_check_mark: smostr@kookmin.ac.kr

<br><br>

### 김사라

<img src="https://user-images.githubusercontent.com/29545214/77186575-71bebe80-6b16-11ea-8496-cb7997b8718a.jpeg" width="300" height="300">
<br><br>

:heavy_check_mark: UI/UX 디자인 기획 및 설계, 프론트엔드 이벤트 핸들링
<br><br>
:heavy_check_mark: [GitHub](https://github.com/20162819)
<br><br>
:heavy_check_mark: goddnsdl0716@kookmin.ac.kr

<br><br>

### 이정현

<img src="https://user-images.githubusercontent.com/29545214/77186609-80a57100-6b16-11ea-9f42-a52effe15266.jpeg" width="300" height="300">
<br><br>

:heavy_check_mark: 역할: UI/UX 디자인 적용 및 구현, 프론트엔드 이벤트 핸들링
<br><br>
:heavy_check_mark: [GitHub](https://github.com/labiss96)
<br><br>
:heavy_check_mark: labiss96@kookmin.ac.kr

<br><br>

### 정준권

<img src="https://user-images.githubusercontent.com/29545214/77186635-8b600600-6b16-11ea-9a7e-2f529acca19a.jpeg" width="300" height="300">
<br><br>

:heavy_check_mark: 안드로이드 백엔드 로직 설계 및 구현
<br><br>
:heavy_check_mark: [GitHub](https://github.com/script-brew)
<br><br>
:heavy_check_mark: junkwon96@kookmin.ac.kr


<br><br>


# 5. 사용법

- **TODO**
