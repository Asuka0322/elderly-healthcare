import request from './axios'

const prefix = '/api/healthcare/employeeSalary'

export function listEmployeeSalary () {
  return request({
    url: `${prefix}/list`,
    method: 'get'
  })
}

export function getEmployeeSalary (params) {
  return request({
    url: `${prefix}/get?id=${params}`,
    method: 'get'
  })
}

export function addEmployeeSalary (params) {
  return request({
    url: `${prefix}/add`,
    method: 'post',
    data: params
  })
}

export function updateEmployeeSalary (params) {
  return request({
    url: `${prefix}/update`,
    method: 'post',
    data: params
  })
}

export function removeEmployeeSalary (params) {
  return request({
    url: `${prefix}/delete`,
    method: 'post',
    data: params
  })
}
