const base = {
    get() {
        return {
            url : "http://localhost:8080/luentanxitong/",
            name: "luentanxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/luentanxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "论坛系统"
        } 
    }
}
export default base
