from django.contrib import admin

# Register your models here.
from .models import Clientes
from .models import Empresas
from .models import Premios
from .models import Registros
from .models import Servicos


admin.site.register(Clientes)
admin.site.register(Empresas)
admin.site.register(Premios)
admin.site.register(Registros)
admin.site.register(Servicos)