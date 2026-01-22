# OrangeHRM QA Automation Assessment

## Objective
This project automates the following flows on OrangeHRM demo website:
- Login
- Navigate to My Info → Contact Details and update information
- Change Password
- Logout

## Tech Stack (To be implemented)
- Automation Tool: Selenium / Cypress
- Framework: Page Object Model (POM)
- Language: Java / JavaScript
- Test Runner: TestNG / Mocha
- Build Tool: Maven / npm

## Deliverables
- Test cases documented in Excel
- Automation code with POM
- Execution proof (screenshots or screen recording)

## Website Under Test
[https://opensource-demo.orangehrmlive.com](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)

## Test Case Documentation
Test cases for this assessment are documented in Google Sheets.

📄 **Test Case Sheet:**  
[Google Docs link](https://docs.google.com/spreadsheets/d/1p1mfOjM5RvAfgUFjGiVe9mv2DDh_E-IWmKs5hsSTLnE/edit?usp=sharing)

---

## Execution Proof (Screenshots & Video Recording)
Below are the proofs of successful automation execution:

## Folder Structure
```
OrangeHRM_Automation/
├── .idea/                          # IDE configuration files
├── src/                            # Source code folder
│   ├── main/                       # Application/Production code (usually empty for automation)
│   └── test/                       # All test-related code
│       └── java/                   # Java source files
│           └── automation/         # Main package name
│               ├── base/           # Core setup and configuration
│               │   └── BaseTest.java
│               ├── pages/          # Page Object Model (POM) classes
│               │   ├── ChangePasswordPage.java
│               │   ├── LoginPage.java
│               │   ├── LogoutPage.java
│               │   └── MyInfoPage.java
│               ├── tests/          # Actual TestNG test scripts
│               │   └── FullFlowTest.java
│               └── utils/          # Helper classes (Excel, Wait, Screenshot)
├── target/                         # Compiled files and build output (Auto-generated)
├── .gitignore                      # Files to exclude from Git
├── pom.xml                         # Maven dependencies and project config
├── testng.xml                      # Test suite execution configuration
└── README.md                       # Project documentation

```

📸 **Screenshots:**  
[Bug recording](https://drive.google.com/file/d/1O0gwQImaYoM3oT2DZPuxcoOwR8RirEUw/view?usp=sharing)

🎥 **Screen Recording (Automation Execution):**  
[Screen Recording](https://drive.google.com/file/d/1plbn-vqXsZKLcJVX4Yon8K9u5EJAmUFJ/view?usp=sharing)
