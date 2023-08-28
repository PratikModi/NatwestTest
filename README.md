# NatWest Coding Test

## Application Overview
NatwestTest is a spring boot rest application which would provide the prime number up to the given initial.

## How to run the application
- Please have Maven version `3.3.3` & Java 11 on your system.
- Use command `mvn clean install` to build the project.
- Use command `mvn spring-boot:run` to run the project.
- Use postman or curl to access `http://localhost:8080/primes/{initial}` GET endpoint. It will return prime numbers up to given initial.
- Application supports 3 Algorithms to find the prime numbers
	1. Sieve Method(Time Complexity: O(Log(Log(N))))
	2. Brute Force Method (Time Complexity: O(N*N))
	3. Square Root Method (Time Complexity: O(N^3/2))
	4. Default is Sieve Method as it's most efficient one. 
- Above mentioned GET endpoint takes one optional request parameter named "algorithm" which can have one of the 3 below mentioned value. Using this parameter it will use algorithm accordingly. 
	1. SIEVE
	2. BRUTE_FORCE
	3. SQROOT
	Example URL: - http://localhost:8080/primes/10?algorithm=SIEVE
	   
##Features in Application
- Application takes care of caching. If you hit the GET endpoint with same initial more than one time then second time onwards value will be fetched from Cache.
- Cache is common across all 3 algorithms. Means if first time you generate prime number with algorithm#1 and second time if you use different algorithm then value will still be fetched from Cache.
- Application supports response in 2 format JSON/XML. You can pass variable "Accept" in request header like application/json or application/xml to generate the response accordingly.  
