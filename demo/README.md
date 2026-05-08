# Spring Boot Learning Journey

## 🔹 Spring Boot Basics
- Setup Spring Boot project
- Created GET API (/hello)
- Learned @RequestParam
- Created POST API (/login)
- Learned @RequestBody
- Implemented Service Layer
- Understood Dependency Injection



## 🔹 Validation & Exception Handling
- Added validation using @NotBlank
- Learned @Valid annotation
- Understood how Spring throws validation exceptions
- Implemented Global Exception Handler
- Extracted field-level error messages



## 🔹 Response Structuring
- Introduced ResponseEntity for proper HTTP status handling
- Differentiated between HTTP status and response body
- Implemented structured API responses
- Created reusable ApiResponse wrapper class



## 🔹 Unified API Response Design
- Unified success and error responses using ApiResponse
- Added separate `data` and `errors` fields for clear semantics
- Improved API consistency and scalability

---

## 🔹 Password Security & BCrypt
- Integrated BCryptPasswordEncoder
- Learned password hashing and verification flow
- Understood salt generation and why hashes differ
- Learned difference between `encode()` and `matches()`
- Explored BCrypt cost factor and its role in brute-force resistance
- Understood application restart vs login request lifecycle

---

## 🔹 Spring Security Basics
- Added Spring Security dependency
- Understood default endpoint protection behavior
- Learned role of security filters
- Configured SecurityFilterChain to allow requests during development


## 🔹 Endpoints

### GET
- /hello?name=YourName

### POST
- /login