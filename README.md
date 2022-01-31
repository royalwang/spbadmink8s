<img src="https://img.shields.io/github/license/bittoruiz/replicadb?style=for-the-badge" alt="License">

# spbadmink8s

Customization of SpringBoot Admin to be deployed in a K8S cluster.

Deployment of a SpringBoot Admin in a K8S cluster to be able to monitor
services external to the cluster such as services deployed in the cluster.

It allows you to have all the replicas of a springboot service that you have configured registered.
the SpringBoot Admin Client.

To do this, the service must expose the actuator endpoint through a service and must have
a label with the name "type".
The value of the "type" label is customizable.

In the following example, "type" is equal to "actuator" 

```
apiVersion: v1
kind: Service
metadata:
  name: {{ .Release.Name }}-spbak8s-svc-act
  labels:
    app: {{ .Release.Name }}-spbak8s
    type: actuator
```
 
Additionally, a Helm Chart is included, for deployment in a K8S cluster.

The configuration parameters are in the Helm Chart values.yaml file. Some of them are shown below, particularly the "labelactuator" value that defines the value of the "type" label of the service. 

```
### Configurations SPBA
serviceaccountname: "spbak8s-service-account"
rolename: "spbak8s-role"
rolebindingname: "spbak8s-role-binding"
labelactuator: "actuator"
spbausername: "springbootadmin"
spbuserpassw: "password"
allnamespaces: "true"
```
