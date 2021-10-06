1. Step
- `sh` : thuc thi 1 shell command

2. Step wrap other step
- `retry` : thuc thi den khi nao success thi thoi
Hoac
- `timeout` : thoat neu step chiem qua nhieu tgian

=> ket hop 2 step nay 
=> VD: chay retry 1 script 3 lan lien tuc neu. 
Sau do chay timeout cho script health-check 3 phut ma step chua xong thi Pipeline bi danh dau falied o Deploy stage

Các wrapper như `timeout` hay `retry` ,...  có thể chứ các steps khác bao gồm cả timeout và retry


```
pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                retry(3) {
                    sh './flakey-deploy.sh'
                }

                timeout(time: 3, unit: 'MINUTES') {
                    sh './health-check.sh'
                }
            }
        }
    }
}
```
Có thể dùng các step ntn
```
pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                timeout(time: 3, unit: 'MINUTES') {
                    retry(5) {
                        sh './flakey-deploy.sh'
                    }
                }
            }
        }
    }
}
```

3. Action khi kết thúc
- Sau khi kết thúc pipeline => Ta có thể cần chạy 1 số bước mang tính chất dọn dẹp, thông báo hoặc chạy các step dựa trên outcome của pipeline
=> Sử dụng `post`

```
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                timeout(time: 3, unit: 'MINUTES') {
                    retry(5) {
                        echo 'Hello world'
                    }
                }
            }
        }
    }
    post {
        alway {
            echo "Luon thuc hien"
        }
        success {
            echo "Chay neu success"
        }
        failure {
            echo "chay neu fail"
        }
        unstable {
            echo "Chay neu run duoc mark unstable (khong on dinh)"
        }
        changed {
            echo "Chay neu state cua Pipeline duoc changed"
            echo "VD: neu Pipeline luc truoc fail nhung hien tai thi da success"
        }
    }
}

```

4. Define các execution environment (xác định môi trường thực thi)
- sử dụng chỉ thị `agent` : nói cho Jenkins biết nơi và cách thực thi Pipeline hoặc tập con của nó 
=> `agent` là chỉ thị cần thiết trong Pipeline
- 1 số vấn đề lquan đến agent:
	- tất cả các step contained trong block sẽ được xếp vào queue để thực thi bởi Jenkins. Ngay khi có 1 executor được available, các step này sẽ được thực thi
	- 1 workspace sẽ là nơi chứa các file được check out từ source control cũng như các file bổ sung cho Pipeline






