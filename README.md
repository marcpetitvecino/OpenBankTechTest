# OpenBankTechTest

- Libraries used in this project:
    - Android Navigation component -> To handle app navigation
    - Retrofit2 -> To make API requests
    - Gson -> To parse response from the server into classes
    - Koin -> For dependency injection
    - Picasso -> To load images from url
    - Kotlin coroutines -> To handle async tasks
    - Junit4 -> To develop unit tests
    - Mockk -> To mock variables in tests
    - Android Arch Core Testing -> To implement InstantExecutionRule() on tests
    
    
    
Project structure:
  
  - Network library:
  
  The network library contains classes that help building the Retrofit client and the Repository class that contains functions with generics to handle each response.
  
  - App library;
  
  The rest of the app is here, the CharacterListFragment uses a ViewModel to get data from the API, everything is handled via events and states, as seen in ListFragmentViewModel.
  
