# 🌐 Discovery Service

El **Discovery Service** es el punto central donde todos los microservicios de la plataforma se registran.  
Gracias a él, los servicios pueden **encontrarse y comunicarse entre sí** sin necesidad de conocer direcciones fijas.

---

## 📋 Funcionalidad

- Actúa como **servidor Eureka**.
- Permite que los microservicios se **registren automáticamente** al iniciar.
- Ofrece un **panel web** para visualizar los servicios disponibles.
- Mejora la **escalabilidad** y **resiliencia** de la plataforma.

---

## ▶️ Cómo usarlo

1. Levantar el servicio con Maven o Docker.
2. Abrir el panel en: [http://localhost:8761](http://localhost:8761).
3. Al iniciar otros microservicios (ej: usuarios, campañas, donaciones), se registrarán y aparecerán en el panel.