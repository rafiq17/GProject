job('example-job-from-job-dsl') {
    scm {
        github('https://github.com/rafiq17/GProject.git', 'master')
    }
    triggers {
        cron("@hourly")
    }
    steps {
        batchFile("C:\Users\mohamed.r.mehaboob\Desktop\groovy-2.4.12\bin\groovy.bat")
    }
}
