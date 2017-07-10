FROM nginx

RUN rm /etc/nginx/conf.d/default.conf
COPY conf /etc/nginx

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]