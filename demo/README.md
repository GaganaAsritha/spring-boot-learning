# Spring Boot Learning Journey

## Day 1
- Setup Spring Boot project
- Created GET API (/hello)
- Learned @RequestParam
- Created POST API (/login)
- Learned @RequestBody
- Implemented Service Layer
- Understood Dependency Injection

## Endpoints

### GET
/hello?name=YourName

### POST
/login
{
"username": "admin",
"password": "1234"
}

## Day 2
- Added validation using @NotBlank
- Learned @Valid annotation
- Understood how Spring throws validation exceptions
- Implemented Global Exception Handler
- Extracted field-level error messages