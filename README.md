### 1) App install
```bash
helm install health-checker-app .helm
```
### 2) Enable minikube tunnel
```bash
minikube tunnel
```
### 3) Port-forwarding
```bash
kubectl port-forward service/health-checker-app-grafana 3000:80
kubectl port-forward service/health-checker-app-kube-pr-prometheus 9090:9090
```
### 4) Grafana credentials
```bash
username - admin
password - grafana
```

### Link postman collection
https://api.postman.com/collections/17657528-c889bca1-e678-42f0-aadc-2fb577690a0e?access_key=PMAT-01HYV7BWMYR1D2VR6VNE9Q9WC1
