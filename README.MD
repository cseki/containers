# Kubernetes Containers Tutorial

This tutorial can give you a hands-on experience to Kubernetes basics and its building blocks. We will also discover the kubectl cli and some other tooling around kubernetes. 

## Getting Started

The training is split up to topics that are all organized with git branches and tags.

Topics:
* Pods
  * excercise/1a-pod-template
  * excercise/1b-pod-solution

       
### Prerequisites

As mentioned above the course is organized with git so some git client is needed to navigate between tags.
Kuberetes cluster needs to be created in order to start deployment. I suggest the easiest way is to create it on Google Cloud - GKE https://cloud.google.com/kubernetes-engine/ . 
If you decided using GKE you need to install the gcloud cli which is part of the google sdk.

__Optional:__ Minikube or any other online sandbox environment 

### Installing

https://cloud.google.com/sdk/downloads 

* Create a project
* Create a cluster - https://cloud.google.com/kubernetes-engine/docs/quickstart

## Excercise

### Pod 

Move the template file:
```bash
mv src/main/k8/templates/pod.yaml src/main/k8/
```
Create the pod
```bash
kubectl create -f src/main/k8/pod.yaml
```

Check if pod is running:
```bash
kubectl get pods
```

Check the logs:
```bash
kubectl logs messages-demo
```

Send some message
```bash
kubectl port-forward messages-demo 8080
```

Delete the pod
```bash
kubectl delete pod messages-demo
```

## Authors

* **Krisztian Cseh** 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

