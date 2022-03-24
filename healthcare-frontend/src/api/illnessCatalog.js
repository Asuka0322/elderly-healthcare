import request from './axios'

const prefix = '/api/healthcare/illnessCatalog'

export function listIllnessCatalog () {
  return request({
    url: `${prefix}/list`,
    method: 'get'
  })
}

export function getIllnessCatalog (params) {
  return request({
    url: `${prefix}/get?id=${params}`,
    method: 'get'
  })
}

export function addIllnessCatalog (params) {
  return request({
    url: `${prefix}/add`,
    method: 'post',
    data: params
  })
}

export function updateIllnessCatalog (params) {
  return request({
    url: `${prefix}/update`,
    method: 'post',
    data: params
  })
}

export function removeIllnessCatalog (params) {
  return request({
    url: `${prefix}/delete`,
    method: 'post',
    data: params
  })
}
