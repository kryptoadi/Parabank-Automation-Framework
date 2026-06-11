# 🚀 Parabank Automation Framework

## 📌 Project Overview

This project is a Selenium Test Automation Framework developed for automating the Parabank Banking Application.

The framework follows industry-standard design patterns and best practices such as Page Object Model (POM), Data-Driven Testing, TestNG, Maven, Jenkins CI/CD, Docker Integration, and Extent Reporting.

---

## 🛠️ Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Apache POI
* Page Object Model (POM)
* Jenkins
* GitHub
* Docker
* Extent Reports
* Log4j
* WebDriverManager

---

## ✨ Framework Features

### Automation Framework

* Page Object Model (POM)
* Reusable Components
* Utility Classes
* Configurable Environment
* Data-Driven Testing

### Test Execution

* TestNG Execution
* Cross Browser Testing
* Retry Failed Test Cases
* Wait Utilities
* Screenshot Capture on Failure

### Reporting

* Extent Reports
* TestNG Reports
* Execution Logs using Log4j

### CI/CD

* GitHub Integration
* Jenkins Freestyle Job
* Jenkins Pipeline
* Jenkinsfile Support

### Containerization

* Docker Integration
* Dockerized Maven Execution

---

## 📂 Project Structure

```text
Capstone-framework
│
├── src/test/java
│   ├── base
│   ├── pages
│   ├── testcases
│   ├── utilities
│   ├── listeners
│
├── src/test/resources
│   ├── config
│   ├── testdata
│
├── screenshots
├── test-output
│
├── pom.xml
├── testng.xml
├── parallel-testng.xml
├── Jenkinsfile
├── Dockerfile
└── docker-compose.yml
```

---

## 📊 Automated Test Scenarios

### Registration Module

* User Registration with Valid Data

### Login Module

* Login with Valid Credentials
* Login with Invalid Credentials

### Account Overview

* Verify Account Overview Page

### Open New Account

* Create New Savings Account
* Create New Checking Account

### Transfer Funds

* Transfer Funds Between Accounts
* Validate Successful Transfer

### Bill Payment

* Pay Utility Bills
* Validate Successful Bill Payment

---

## 📁 Excel Data Driven Testing

Test data is maintained in:

```text
src/test/resources/testdata/ParabankData.xlsx
```

Sheets Used:

| Sheet Name   | Purpose           |
| ------------ | ----------------- |
| Registration | Registration Data |
| Login        | Login Data        |
| Transfer     | Transfer Data     |
| BillPay      | Bill Payment Data |
| TestCases    | Manual Test Cases |

---

## ▶️ How To Run The Project

### Execute Through Eclipse

Run:

```text
testng.xml
```

or

```text
parallel-testng.xml
```

---

### Execute Through Maven

```bash
mvn clean test
```

---

### Execute Through Jenkins

1. Push code to GitHub
2. Jenkins pulls latest code
3. Jenkins executes Maven Build
4. TestNG Suite Runs
5. Extent Reports Generated

---

## 🐳 Docker Execution

Build Docker Image:

```bash
docker build -t parabank-framework .
```

Run Docker Container:

```bash
docker run parabank-framework
```

---

## 📈 Reporting

Reports Generated:

```text
test-output/ExtentReport.html
```

Additional Reports:

* TestNG Reports
* Screenshots on Failure
* Execution Logs

---

## 🔄 CI/CD Pipeline

GitHub
↓
Jenkins
↓
Jenkinsfile
↓
Maven Build
↓
TestNG Execution
↓
Extent Reports
↓
Build Status

---

## 🐞 Defect Tracking

Defects are tracked using JIRA.

Defect Information Includes:

* Defect ID
* Summary
* Priority
* Severity
* Steps to Reproduce
* Expected Result
* Actual Result
* Attachments
* Status Tracking

---

## 📸 Screenshots

### Jenkins Pipeline Success

(Add Screenshot)

### Extent Report

(Add Screenshot)

### Docker Build

(Add Screenshot)

### GitHub Repository

(Add Screenshot)

### JIRA Dashboard

(Add Screenshot)

---

## 👨‍💻 Author

Aditya Kumar

B.Tech Computer Science & Engineering

SRM University AP

CGPA: 8.58

---

## ⭐ Key Achievements

✔ Selenium WebDriver Framework

✔ Page Object Model

✔ Data Driven Testing

✔ Apache POI Integration

✔ Cross Browser Testing

✔ Retry Analyzer

✔ Screenshot Utility

✔ Extent Reporting

✔ Jenkins Integration

✔ Jenkins Pipeline

✔ Docker Integration

✔ GitHub Version Control

✔ JIRA Defect Tracking
