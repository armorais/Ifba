from __future__ import unicode_literals
from ctfidelidade.models import *
from ctfidelidade.serializers import *
from rest_framework.views import  APIView
from rest_framework.response import Response
from django.utils import timezone
from rest_framework import status
from django.http import Http404
import datetime
import pytz

#
#	Clientes
#

class RegistrosList(APIView):
	def get(self, request, format=None):
		registros = Registros.objects.all()
		serializer = RegistrosSerializer(registros, many=True)
		return Response(serializer.data)

	def post(self, request, format=None):
		serializer = RegistrosSerializer(data=request.data)
		if serializer.is_valid():
			serializer.save()
			return Response(serializer.data, status=status.HTTP_201_CREATED)
		return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)

# TODO - Separar a parte lógica da view

class RegistroDetail(APIView):
	serializer_class = RegistrosSerializer

	def get(self, request, cpf, format=None):
		registros = Registros.objects.filter(cliente__cpf = cpf)
		for aux in registros:
			dias = datetime.datetime.now(pytz.utc) - aux.data
			servico = aux.servico
			if (dias.days > servico.validade):
				print(dias.days)
				aux.status = False
		serializer = RegistrosSerializer(registros, many=True)
		return Response(serializer.data)