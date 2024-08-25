# Smart API Automation Project

<p>This project implements API automation for <a href="https://smartapi.angelbroking.com/docs">Angel One's Smart API</a> using the <strong>REST Assured framework</strong> in Java. The goal of this project is to ensure that the API responses conform to the expected standards, including validating response codes, verifying the schema, and ensuring that data types are correctly mapped.</p>

## Project Overview

<p>The API testing in this project focuses on the following key aspects:</p>
<ul>
    <li><strong>Request Validation:</strong> Hitting APIs based on their respective request types and verifying if the response contains the expected status codes.</li>
    <li><strong>Response Validation:</strong> Ensuring that the response data conforms to the expected schema and checking that each field adheres to the correct data types (e.g., <code>String</code>, <code>long</code>, <code>int</code>, <code>Date</code>, etc.).</li>
    <li><strong>Schema Validation:</strong> Verifying the API responses against predefined JSON schemas using the <code>json-schema-validator</code> library.</li>
    <li><strong>Data Management:</strong> Test data is fetched from JSON files and supplied to the API requests using <strong>TestNG's DataProviders</strong>. The data is converted to the supported schema types before being passed into the request object, ensuring that no invalid data is processed.</li>
</ul>

## Dependencies

<p>The following dependencies are used in the project:</p>
<ul>
    <li><strong>REST Assured:</strong> For API testing and validation.</li>
    <li><strong>TestNG:</strong> For managing test cases, assertions, and DataProviders.</li>
    <li><strong>Gson:</strong> For JSON parsing and serialization.</li>
    <li><strong>Maven:</strong> For dependency management and project build.</li>
    <li><strong>JSON-Path:</strong> For extracting data from JSON responses.</li>
    <li><strong>OkHttp3:</strong> For making HTTP requests.</li>
    <li><strong>JSON-Schema-Validator:</strong> For validating API responses against predefined schemas.</li>
    <li><strong>Jackson-Bind:</strong> For handling JSON data binding.</li>
</ul>

## Project Workflow

<p>The project workflow consists of the following steps:</p>
<ul>
    <li><strong>Request Execution:</strong> API requests are sent based on the appropriate HTTP methods, with data retrieved from external JSON files. These requests are structured to ensure compliance with the Smart API's documented formats.</li>
    <li><strong>Response Handling:</strong> The received API responses are evaluated to ensure that the status codes match the expected outcomes. Further validation checks are conducted on the response body to ensure compliance with the predefined JSON schema.</li>
    <li><strong>Data Type Mapping:</strong> The fields in the response object are checked to ensure they are correctly mapped to their expected data types, such as <code>String</code>, <code>int</code>, <code>long</code>, <code>Date</code>, etc.</li>
    <li><strong>Assertion and Validation:</strong> Using <strong>TestNG</strong> assertions and <strong>Hamcrest Matchers</strong>, we validate that the API responses meet the expected conditions.</li>
</ul>

## How to Use

<p>Follow these steps to run the project:</p>
<ul>
    <li>Clone the repository.</li>
    <li>Ensure you have the following installed:</li>
    <ul>
        <li>Java (JDK)</li>
        <li>Maven</li>
    </ul>
    <li>Run <code>mvn clean install</code> to install dependencies and build the project.</li>
    <li>Execute the test suite using TestNG to run the API tests.</li>
    <li>Review the test results for validation of the API responses.</li>
</ul>

## Conclusion

<p>This automation project ensures the reliability and accuracy of API responses by combining data-driven testing with extensive schema and data type validations. The use of REST Assured and other supporting libraries helps maintain a robust testing framework, ensuring that the Smart API is functioning as expected.</p>
