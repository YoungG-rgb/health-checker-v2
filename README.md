### Add secret
```
kubectl create secret generic db-config-secret --from-literal=postgres-password=password --from-literal=password=password
```

### App install
```bash
helm install health-checker-app .helm
```
```bash
minikube tunnel
```

### Link postman collection
https://api.postman.com/collections/17657528-c889bca1-e678-42f0-aadc-2fb577690a0e?access_key=PMAT-01HYV7BWMYR1D2VR6VNE9Q9WC1
