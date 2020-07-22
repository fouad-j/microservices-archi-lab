
## Ports
| Service name | Port |
| ------ | ----------- |
| products   | 9010 |
| orders   | 9011 |
| payments   | 9012 |
| ui-client   | 8080 |
| s-config   | 9050 |


## Techno by services
### Products
- Spring boot
- Spring JPA
### Orders
- Spring boot
- Spring JPA
### Payments
- Spring boot
- Spring JPA
### UI Client
- Spring boot
- Thymeleaf
- Spring cloud config client
### Sidecar-config 
- Spring cloud config server


## Sidecar-config
-  to retrieve app properties http://localhost:9050/{application}/{profile}
