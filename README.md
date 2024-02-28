[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]


<!-- PROJECT LOGO -->
<br />
<h3 align="center">Portfolio Manager</h3>
<br />


<!-- ABOUT THE PROJECT -->
## About The Project

Simple portfolio manager to keep best practices in one place.


### Built With
- Spring Boot
- Postgre DB

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Roadmap

- [x] Setup
- [x] Simple model
- [x] Postgre DB with Docker
- [x] Flyway for migrations
- [ ] REST API to get portfolio data
  - [ ] Open api documentation
  - [ ] Open API generator
- [ ] Swagger
- [ ] Data Loading (current prices) -> Keep in mind that data loading will be done in seperate application in future
  - [ ] generate Data Model from spec
    - [ ] create api spec if not available
  - [ ] load data from api (yahoo finance)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* ..
  ```sh
  ...
  ```

### Installation

1. start Postgre DB
   ```sh
   cd 010-infra
   docker-compose up
   ```
2. run main application
<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Usage

TODO

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/JosipFX/portfolio-manager2.svg?style=for-the-badge
[contributors-url]: https://github.com/JosipFX/portfolio-manager2/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/JosipFX/portfolio-manager2.svg?style=for-the-badge
[forks-url]: https://github.com/JosipFX/portfolio-manager2/network/members
[stars-shield]: https://img.shields.io/github/stars/JosipFX/portfolio-manager2.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/JosipFX/portfolio-manager2.svg?style=for-the-badge
[issues-url]: https://github.com/JosipFX/portfolio-manager2/issues
[license-shield]: https://img.shields.io/github/license/JosipFX/portfolio-manager2.svg?style=for-the-badge
[license-url]: https://github.com/JosipFX/portfolio-manager2/blob/master/LICENSE.txt
