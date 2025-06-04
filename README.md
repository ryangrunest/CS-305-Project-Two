# Artemis Financial Secure Web Application

Note: You can find the Practices for Secure Software Report in the 'docs' directory.

## Project Overview

### Client Summary and Software Requirements

Artemis Financial is a consulting company specializing in individualized financial plans, including savings, retirement, investments, and insurance. Artemis Financial engaged Global Rain to modernize its operations and strengthen the security of its public web interface. The primary requirement was to implement a secure file verification step—specifically, a checksum mechanism—to ensure the integrity and security of data transfers within its web application.

### Addressing Software Security Vulnerabilities

Upon assessing Artemis Financial’s software, several security vulnerabilities were identified and addressed, focusing on secure communication and data integrity. The code was refactored to use industry-standard cryptographic hashing (SHA-256) for checksum verification and to ensure all communications were encrypted using HTTPS. Secure coding is essential to prevent data breaches, protect sensitive client information, and maintain trust. Strong software security directly contributes to a company’s reputation, compliance, and overall well-being.

### Vulnerability Assessment Experience

The vulnerability assessment process was both challenging and insightful. Identifying outdated dependencies and ensuring proper exception handling required careful review. The process highlighted the importance of regular dependency checks and secure error management.

### Increasing Layers of Security

Security was enhanced by implementing SSL/TLS for encrypted communications, integrating cryptographic hashing for data verification, and using the OWASP Dependency-Check tool to identify vulnerable libraries. In the future, automated tools like static code analyzers and vulnerability scanners, combined with manual code reviews, will be used to assess risks and select appropriate mitigation strategies.

### Ensuring Functionality and Security

After refactoring, the application’s functionality was verified through unit and integration testing, and vulnerability scans were re-run to ensure no new issues were introduced. This approach ensured the application remained both functional and secure after changes.

### Helpful Resources and Practices

Key resources and tools included the Spring Boot framework, Maven for dependency management, and the OWASP Dependency-Check plugin. Adhering to secure coding practices—such as input validation, exception handling, and regular dependency updates—proved invaluable and will be useful in future projects.

### Demonstrating Skills to Employers

This assignment demonstrates the ability to identify and remediate software vulnerabilities, implement secure coding practices, and deliver production-quality, secure applications. The refactored code, security assessment reports, and testing documentation can be showcased as evidence of skills and experience to future employers.