from django.conf.urls import url
from django.urls import path, include
from ctfidelidade.views import *
from rest_framework import routers, serializers, viewsets
from rest_framework.urlpatterns import format_suffix_patterns

urlpatterns = [
    url(r'^registros/',RegistrosList.as_view(),name='home'),
    url(r'^registro/(?P<cpf>[\w\-]+)/$',RegistroDetail.as_view(),name='home2')
]

urlpatterns = format_suffix_patterns(urlpatterns)