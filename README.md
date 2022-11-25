# 📚 Kyobo-AOS 📚

> THE SOPT 31TH 합동 세미나 2조 Android팀 <br>
22.11.12 - 22.11.25

<br>

## Video
<img width="270" src="">

<br>

## Contributors

| [@murjune](https://github.com/murjune) | [@waterminn](https://github.com/waterminn) | [@skylartosf](https://github.com/skylartosf) |
| :---: | :---: | :---: |
|**SearchView, DetailView**|**HomeView**|**MyPageView**|

<br>

## Convention
[Convention 보러가기 Click ✔](https://www.notion.so/2-AOS-ed7d551b084a4faaa36a263eecffae5a)

<br>

## Foldering

```
📂 com.junewon.kyobo_android
┣ 📂 data
┃ ┣ 📂 entity
┃ ┃ ┣ 📜 Book.kt
┃ ┃ ┣ 📜 RecentBook.kt
┃ ┃ ┣ 📜 User.kt
┃ ┣ 📂 model
┃ ┃ ┣ 📂 response
┃ ┃ ┃ ┣ 📜 BaseResponse.kt
┃ ┃ ┃ ┣ 📜 BookDetailResponse.kt
┃ ┃ ┃ ┣ 📜 HomeResponse.kt
┃ ┃ ┃ ┣ 📜 MyPageResponse.kt
┃ ┃ ┃ ┣ 📜 UserResponse.kt
┃ ┃ ┣ 📂 request
┃ ┃ ┃ ┣ 📜 UserRequest.kt
┃ ┣ 📂 service
┃ ┃ ┣ 📜 DetailService.kt
┃ ┃ ┣ 📜 HomeService.kt
┃ ┃ ┣ 📜 MyPageService.kt
┃ ┃ ┣ 📜 NetworkModule.kt
┣ 📂 presentation
┃ ┣ 📜 MainActivity.kt
┃ ┣ 📜 NotificationFragment.kt
┃ ┣ 📜 CategoryFragment.kt
┃ ┣ 📂 detail
┃ ┃ ┣ 📜 DetailActivity.kt
┃ ┃ ┣ 📜 DetailScreen.kt
┃ ┃ ┣ 📜 DetailViewModel.kt
┃ ┣ 📂 home
┃ ┃ ┣ 📜 HomeFragment.kt
┃ ┃ ┣ 📜 HomeViewModel.kt
┃ ┃ ┣ 📂 best
┃ ┃ ┃ ┣ 📜 BestAdapter.kt
┃ ┃ ┣ 📂 borrow
┃ ┃ ┃ ┣ 📜 BorrowedAdapter.kt
┃ ┃ ┣ 📂 category
┃ ┃ ┃ ┣ 📜 CategoryAdapter.kt
┃ ┃ ┣ 📂 newbook
┃ ┃ ┃ ┣ 📜 NewAdapter.kt
┃ ┣ 📂 mypage
┃ ┃ ┣ 📜 MyPageAdapter.kt
┃ ┃ ┣ 📜 MyPageFragment.kt
┃ ┣ 📂 search
┃ ┃ ┣ 📜 SearchActivity.kt
┃ ┃ ┣ 📜 SearchScreen.kt
┣ 📂 ui
┃ ┣ 📂 componet
┃ ┃ ┣ 📜 BasicButton.kt
┃ ┃ ┣ 📜 KyoboButtons.kt
┃ ┃ ┣ 📂 detail
┃ ┃ ┃ ┣ 📜 DetailBookImage.kt
┃ ┃ ┃ ┣ 📜 TakeOutBookCard.kt
┃ ┃ ┣ 📂 search
┃ ┃ ┃ ┣ 📜 RecentBookItem.kt
┃ ┃ ┃ ┣ 📜 RecentBooks.kt
┃ ┃ ┃ ┣ 📜 RecentSearchTerm.kt
┃ ┃ ┃ ┣ 📜 SearchAppBar.kt
┃ ┃ ┃ ┣ 📜 SearchTextField.kt
┃ ┣ 📂 theme
┃ ┃ ┣ 📜 Shape.kt
┃ ┃ ┣ 📜 Theme.kt
┃ ┃ ┣ 📜 Typhograph.kt
┣ 📂 util
┃ ┣ 📜 DpToSp.kt
┃ ┣ 📜 FragmentTransactionExt.kt
```
